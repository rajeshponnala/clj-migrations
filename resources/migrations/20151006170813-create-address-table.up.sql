CREATE TABLE IF NOT EXISTS address(
        id integer primary Key,
        state_id integer references state,
        street_no char(32) not null
        )
