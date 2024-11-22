create database ticket_booking;

use ticket_booking;

create table users (
    user_id int auto_increment primary key,
    user_name varchar(100),
    password varchar(100),
    name varchar(100),
    phno varchar(10),
    email varchar(200),
    address text,
    created_by varchar(100),
    create_date date,
    modified_by varchar(100),
    modified_date date
);

create table screens (
    screen_id int auto_increment primary key,
    screen_name varchar(100),
    location varchar(200),
    city varchar(100),
    state varchar(100),
    country varchar(100),
    seating_capacity int,
    created_by varchar(100),
    create_date date,
    modified_by varchar(100),
    modified_date date
);

create table movies (
    movie_id int auto_increment primary key,
    movie_title varchar(200),
    duration time,
    rating decimal(2, 1),
    release_date date,
    audio_language varchar(100),
    created_by varchar(100),
    create_date date,
    modified_by varchar(100),
    modified_date date
);

create table showtimes (
    show_time_id int auto_increment primary key,
    screen_id int,
    show_time time,
    is_active int,
    current_movie_id int,
    created_by varchar(100),
    create_date date,
    modified_by varchar(100),
    modified_date date,
    
    foreign key (screen_id) references screens(screen_id),
    foreign key (current_movie_id) references movies(movie_id)
);

create table is_active_lookup (
    is_active_id int auto_increment primary key,
    is_active_code char(1),
    description varchar(50)
);

create table seats (
    seat_id int auto_increment primary key,
    screen_id int,
    seat_number int,
    created_by varchar(100),
    create_date date,
    modified_by varchar(100),
    modified_date date,

    foreign key (screen_id) references screens(screen_id)
);

create table booking_statuses (
    booking_status_id int auto_increment primary key,
    booking_status_code varchar(10),
    description text,
    display_name varchar(50),
    created_by varchar(100),
    create_date date,
    modified_by varchar(100),
    modified_date date
);

create table bookings (
    booking_id int auto_increment primary key,
    booking_number int,
    user_id int,
    movie_id int,
    show_time_id int,
    screen_id int,
    seat_id int,
    booking_status_id int,
    created_by varchar(100),
    create_date date,
    modified_by varchar(100),
    modified_date date,

    foreign key (user_id) references users(user_id),
    foreign key (movie_id) references movies(movie_id),
    foreign key (show_time_id) references showtimes(show_time_id),
    foreign key (screen_id) references screens(screen_id),
    foreign key (seat_id) references seats(seat_id),
    foreign key (booking_status_id) references booking_statuses(booking_status_id)
);

create table payment_methods (
    payment_method_id int auto_increment primary key,
    payment_method_name varchar(100)
);

create table transactions (
    txn_id int auto_increment primary key,
    txn_date date,
    booking_number int,
    txn_amt decimal(10, 2),
    txn_status varchar(50),
    payment_method_id int,
    created_by varchar(100),
    create_date date,
    modified_by varchar(100),
    modified_date date,

    foreign key (payment_method_id) references payment_methods(payment_method_id)
);


create table seats_screen_mapping (
    id int auto_increment primary key,
    seat_id int,
    screen_id int,

    foreign key (seat_id) references seats(seat_id),
    foreign key (screen_id) references screens(screen_id)
);
