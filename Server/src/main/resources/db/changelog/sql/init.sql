create table if not exists teams
(
    id serial PRIMARY KEY,
    name CHARACTER VARYING(30)
);
create table if not exists matches
(
    id serial PRIMARY KEY,
    home_id serial references teams (id),
    away_id serial references teams (id),
    date timestamp
);
insert into teams(name) values ('Chelsea'), ('Liverpool');
insert into matches(home_id, away_id, date) values (
                                                       (select id from teams where name='Chelsea'),
                                                       (select id from teams where name='Liverpool'),
                                                       '2022-03-15 22:00:00'
                                                   );