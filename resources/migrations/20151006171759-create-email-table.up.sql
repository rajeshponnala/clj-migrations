CREATE TABLE IF NOT EXISTS email(
        id integer primary Key,
        email varchar(80) not null,
        user_id integer references users
);
