drop table if exists transactions;
drop table if exists users;

create table users (
    id serial primary key,
    name varchar(50),
    balance int
);

create table if not exists transactions (
    id serial primary key,
    user_id bigint,
    amount int,
    transaction_date timestamp,
    constraint fk_user_id 
			foreign key (user_id) 
			references users(id) 
			on delete cascade
);

insert into users (name, balance)
values
    ('Dr. Dre', 1000),
		('Snoop Dogg', 2000),
    ('TuPac Shakur', 3000),
    ('Marshal Mathers', 4000);
