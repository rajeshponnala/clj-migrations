CREATE TABLE users (
        id  integer primary Key,
        first char(32) not null,
        last  char(32) not null,
        account_id integer not null,
        foreign key (account_id) references account(id)
);
