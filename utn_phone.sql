use utn_phones;

#drop table regions

create table if not exists provinces
(
    entity_id int auto_increment not null,
    name      varchar(50)        not null,
    constraint pk_provinces_entity_id primary key (entity_id)
);

#drop table localities

create table if not exists localities
(
    entity_id   int auto_increment not null,
    prefix      int                not null,
    province_id int                not null,
    name        varchar(50)        not null,
    constraint pk_localities_entity_id primary key (entity_id),
    constraint fk_provinces_id foreign key (province_id) references provinces (entity_id)
);

create table if not exists users
(
    entity_id int auto_increment not null,
    dni       int(8)             not null,
    firstname varchar(32)        not null,
    lastname  varchar(32)        not null,
    username  varchar(40)        not null,
    email     varchar(128)       not null,
    password  varchar(100)       not null,
    type      enum ('empleado','cliente'),
    constraint pk_users_entity_id primary key (entity_id)
);


create table if not exists phone_lines
(

    entity_id int auto_increment not null,
    number    int                not null,
    type      enum ('hogar','movil'),
    user_id   int                not null,
    constraint pk_phone_lines_entity_id primary key (entity_id),
    constraint fk_users_id foreign key (user_id) references users (entity_id)

);


create table if not exists rates(
    entity_id int auto_increment not null,
    localitie_sender_id int not null,
    localitie_receiver_id int not null,
    price decimal(6,2) not null,
    cost decimal(6,2) not null,
    constraint pk_rates_entity_id primary key (entity_id),
    constraint fk_localities_sender_id foreign key (localitie_sender_id) references localities (entity_id),
    constraint fk_localities_receiver_id foreign key (localitie_receiver_id) references localities (entity_id)
);

create table if not exists bills(
    entity_id int auto_increment not null,
    phone_line_id int not null,
    total_calls int not null,
    total_price decimal(6,2) not null,
    total_cost decimal(6,2) not null,
    created_at timestamp,
    expired_at timestamp,
    constraint pk_bills_entity_id primary key (entity_id),
    constraint fk_phone_lines_id foreign key (phone_line_id) references phone_lines (entity_id)
);


create table if not exists calls(
    entity_id int auto_increment not null,
    number_sender int not null,
    number_receiver int not null,
    localitie_sender_id int not null,
    localitie_receiver_id int not null,
    price_per_minute decimal(6,2) not null,
    duration int not null,
    total_price decimal(6,2) not null,
    bill_id int not null,
    constraint pk_calls_entity_id primary key (entity_id),
    foreign key (localitie_sender_id) references localities (entity_id),
    foreign key (localitie_receiver_id) references localities (entity_id),
    constraint fk_bill_id foreign key (bill_id) references bills (entity_id)
);



