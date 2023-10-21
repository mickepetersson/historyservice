insert into MEDIA_TYPE(type)
values ('music'),
       ('video'),
       ('podcast');

/*
insert into GENRES (genre_name)
values ('Black Metal'),
       ('Crust Punk'),
       ('Thrash Metal'),
       ('Reggae'),
       ('Bachata');

insert into ARTISTS(genre_id, artist_name)
values  (1,'Batushka'),
        (1,'Grima'),
        (2, 'Wolfbrigade'),
        (3, 'Metallica'),
        (4, 'Bob Marley'),
        (5, 'Romeo Santos');

insert into albums(artist_id, album_title, release_date)
VALUES (1, 'Litourgiya', '4-12-2015'),
       (2, 'Rotting Garden', '22-01-2021'),
       (2, 'Frostbitten', '29-7-2022'),
       (3, 'Run With the Hunted', '28-4-2017'),
       (4, 'Kill em All','25-07-1983'),
       (4, 'Ride the Lightning ','27-07-1984'),
       (5, 'Confrontation ','23-05-1983'),
       (6, 'Formula, Vol. 2','25-02-2014');


insert into tracks(artist_id, genre_id, media_type_id, media_name, release_date, album_id, url)
VALUES (1, 1, 1, 'Yekteniya 1', '04-12-2015', 1,'https://open.spotify.com/track/1cQXDosKkPHAZVi7YWYX15'),
       (1, 1, 1,'Yekteniya 2', '04-12-2015', 1, 'https://open.spotify.com/track/3V8k7s6ORTUFYJD7hKRg9O'),
       (1, 1, 1,'Yekteniya 3', '04-12-2015', 1, 'https://open.spotify.com/track/0cxwhfboz5lX2rcxOqzPyb'),
       (1, 1, 1,'Yekteniya 4', '04-12-2015', 1, 'https://open.spotify.com/track/56XB0noQfCYgSyREol4zDg'),
       (1, 1, 1,'Yekteniya 5', '04-12-2015', 1, 'https://open.spotify.com/track/5IuXQQ3qGtKesuMCGpnx3Q'),
       (1, 1, 1,'Yekteniya 6', '04-12-2015', 1, 'https://open.spotify.com/track/2OTHuzzpXnTXnAXJBtr0p5'),
       (1, 1, 1,'Yekteniya 7', '04-12-2015', 1, 'https://open.spotify.com/track/3QdqzaUxlN0aHCuWDh54hR'),
       (1, 1, 1,'Yekteniya 8', '04-12-2015', 1, 'https://open.spotify.com/track/7klYBHuZV8gmqiUkMBYwcR');

insert into tracks(artist_id, genre_id, media_type_id, media_name, release_date, album_id, url)
VALUES (2, 1, 1, 'Cedar and Owls', '22-01-2021',2,'https://open.spotify.com/track/5kDsoNpjCXcDoDvu9jkGid' ),
       (2, 1, 1, 'Mourning Comes at Sunset', '22-01-2021',2,'https://open.spotify.com/track/2eUstamuLvpnYJjYv9Vzyn'),
       (2, 1, 1, 'At the Foot of the Red Mountains', '22-01-2021',2,'https://open.spotify.com/track/7DdW2o2X5OBYXAwtBJeBQg'),
       (2, 1, 1, 'Old Oak', '22-01-2021',2,'https://open.spotify.com/track/0JkmQDtM0q8yQvvcm6ZqQN'),
       (2, 1, 1, 'Rotting Garden', '22-01-2021',2, 'https://open.spotify.com/track/3tQAktvLTw9tfG9uPV3Wgs'),
       (2, 1, 1, 'Grom', '22-01-2021',2,'https://open.spotify.com/track/2WdktvMa7HDR6sJCVPiW0c'),
       (2, 1, 1, 'Devotion to Lord', '22-01-2021',2,'https://open.spotify.com/track/4nKqHHswQifdB1K9trYMsa'),
       (2, 1, 1, 'Gloomy Heart of the Coldest Land', '29-07-2022',2,'https://open.spotify.com/track/6kC20ciWqv0SpLr0jTXV72'),
       (2, 1, 1, 'Giants Eternal Sleep', '29-07-2022',2,'https://open.spotify.com/track/2Mhd8Ykd4q3oujIDcYXyQd'),
       (2, 1, 1, 'Into the Twilight', '29-07-2022',2,'https://open.spotify.com/track/3GBxz8dCi3h9iRVb9kZEbA'),
       (2, 1, 1, 'Hunger God', '29-07-2022',2,'https://open.spotify.com/track/0DVMj3BKQomgyplcmEaiXA'),
       (2, 1, 1, 'Moonspell and Grief','29-07-2022',2,'https://open.spotify.com/track/5vB7TocXozkSbabQuvCvaU'),
       (2, 1, 1, 'Winter Morning Tower','29-07-2022',2,'https://open.spotify.com/track/5Ii1aGR6VhtfDp5FlOHGPH'),
       (2, 1, 1, 'Mana', '29-07-2022',2,'https://open.spotify.com/track/0K9Qtu4xQCLVexxofj0EsO');

insert into tracks(artist_id, genre_id, media_type_id, media_name, release_date, album_id, url)
VALUES  (3, 2, 1, 'Nomad Pack', '28-04-2017',3,'https://open.spotify.com/track/79CTFuuz3ZgsPtXmWuxxMG'),
        (3, 2, 1, 'Warsaw Speedwolf', '28-04-2017',3,'https://open.spotify.com/track/6M3DAZWL6ANSzHGUG9DowU'),
        (3, 2, 1, 'Lucid Monomania', '28-04-2017',3,'https://open.spotify.com/track/6fRIpM6jfiJ5RtkewftkRA'),
        (3, 2, 1, 'No Reward', '28-04-2017',3,'https://open.spotify.com/track/1ZH7duVv9WtH1OPI2Se1R1'),
        (3, 2, 1, 'Kallocain', '28-04-2017',3,'https://open.spotify.com/track/1EZ455jzHbIqFMoR8Y2P0v'),
        (3, 2, 1, 'Return to None', '28-04-2017',3,'https://open.spotify.com/track/6NkFqoRNQg1U7xjCuOtacs'),
        (3, 2, 1, 'War on Rules', '28-04-2017',3,'https://open.spotify.com/track/0oVYdZmafAy9vaNWSetEtG'),
        (3, 2, 1, 'Feral Blood', '28-04-2017',3,'https://open.spotify.com/track/2kR8GSj13WpFB1TjKcAO5W'),
        (3, 2, 1, 'Under the Bell', '28-04-2017',3,'https://open.spotify.com/track/5NXQLAhhkEuW7bqpfwm1Y8'),
        (3, 2, 1, 'Dead Cold', '28-04-2017',3,'https://open.spotify.com/track/3GysYt9oJo9jCncbFM6iuV');

insert into tracks(artist_id, genre_id, media_type_id, media_name, release_date, album_id)
VALUES (4, 3, 1, 'Hit the Lights', '25-07-1983', 5),
       (4, 3, 1,'The Four Horsemen', '25-07-1983', 5),
       (4, 3, 1,'Motorbreath', '25-07-1983', 5),
       (4, 3, 1,'Jump in the Fire', '25-07-1983', 5),
       (4, 3, 1,'(Anesthesia)-Pulling Teeth', '25-07-1983', 5),
       (4, 3, 1,'Whiplash', '25-07-1983', 5),
       (4, 3, 1,'Phantom Lord', '25-07-1983', 5),
       (4, 3, 1,'No Remorse', '25-07-1983', 5),
       (4, 3, 1,'Seek & Destroy', '25-07-1983', 5),
       (4, 3, 1,'Metal Militia', '25-07-1983', 5);

insert into tracks(artist_id, genre_id, media_type_id, media_name, release_date, album_id)
VALUES (4, 3, 1, 'Fight Fire With Fire', '27-07-1984', 6),
       (4, 3, 1,'Ride The Lightning', '27-07-1984', 6),
       (4, 3, 1,'For Whom The Bells Toll', '27-07-1984', 6),
       (4, 3, 1,'Fade To Black', '27-07-1984', 6),
       (4, 3, 1,'Trapped Under Ice', '27-07-1984', 6),
       (4, 3, 1,'Escape ', '27-07-1984', 6),
       (4, 3, 1,'Creeping Death', '27-07-1984', 6),
       (4, 3, 1,'Call Of Ktulu', '27-07-1984', 6);*/
