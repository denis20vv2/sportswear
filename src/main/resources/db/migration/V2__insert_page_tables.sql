INSERT INTO contact_info (id, phone, email, address, telegram, vk)
VALUES (1,
        '+7 999 123-45-67',
        'info@example.com',
        'Пенза, ул. Красная 1',
        '@example_telegram',
        'vk.com/example');

INSERT INTO filter_param (id, filters)
VALUES (5, '["colour","type","sizeBall","material"]'),
       (3, '["colour","type","sizeShoes","material"]'),
       (6, '["colour","type","sizeProduct"]'),
       (7, '["colour"]'),
       (8, '["colour","type","sizeTShorts","material"]'),
       (9, '["colour","type","sizeProduct"]'),
       (10, '["colour","type","sizeGloves","material"]'),
       (11, '["colour","type","sizeProduct"]'),
       (12, '["colour","type","sizeShorts","material"]'),
       (13, '["colour","material","sizeJacket"]'),
       (14, '["colour","sizePants","material"]'),
       (15, '["colour","material","sizeSweater"]'),
       (16, '["colour","sizeSportsUnderwear","material"]');

INSERT INTO page (id, page_name, contact_info_id, filter_id)
VALUES (1,
        'Главная',
        1,
        null),
       (3,
        'Обувь',
        1,
        3),
       (5,
        'Мячи',
        1,
        5),
       (6,
        'Аксессуары',
        1,
        6),
       (7,
        'Инвентарь',
        1,
        7),
       (2,
        'Игровая форма',
        1,
        null),
       (12,
        'Шорты',
        1,
        12),
       (8,
        'Футболки',
        1,
        8),
       (9,
        'Щитки',
        1,
        9),
       (10,
        'Вратарские Перчатки',
        1,
        10),
       (11,
        'Гетры и гольфы',
        1,
        11),
       (13,
        'Куртки и ветровки',
        1,
        13),
       (14,
        'Брюки',
        1,
        14),
       (15,
        'Джемперы/олимпийки/толстовки/худи',
        1,
        15),
       (16,
        'Спортивное бельё',
        1,
        16),
       (4,
        'Одежда',
        1,
        null);


INSERT INTO product (id, name, price, image_url, path, page_id)
VALUES (1,
        'Футбол',
        9990.00,
        'https://sportego.ru/img/cat_header2023/15.png',
        null,
        1),
       (2,
        'Баскетбол',
        null,
        'https://www.fan.ru/f/_cat/1_7066.webp',
        1,
        1),
       (3,
        'Волейбол',
        null,
        'https://lh5.googleusercontent.com/proxy/M6uKOSUtUcsDLBeBZuVR30zVUml_o2mmb2_HblczTm9XlSm_9jy5ka8SIPMlTC-mHsi4cWrEQvSpyu7dmKlNTJkl9UrJXyF59yVyD5FjdAd4JVwj5dw9XaVbyHgL_3M',
        null,
        1)
        ,
       (4,
        'Футзал',
        null,
        'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSlrR5l23OTz8mEhzwE00fAwkCkrxnCLYIKSQ&s',
        1,
        1),
       (5,
        'Шорты',
        null,
        'https://sportego.ru/img/cat_header2023/15.png',
        '/api/page/12',
        2),
       (6,
        'Футболки',
        null,
        'https://www.fan.ru/f/_cat/1_7066.webp',
        '/api/page/8',
        2),
       (7,
        'Щитки',
        null,
        'https://lh5.googleusercontent.com/proxy/M6uKOSUtUcsDLBeBZuVR30zVUml_o2mmb2_HblczTm9XlSm_9jy5ka8SIPMlTC-mHsi4cWrEQvSpyu7dmKlNTJkl9UrJXyF59yVyD5FjdAd4JVwj5dw9XaVbyHgL_3M',
        '/api/page/9',
        2),
       (8,
        'Вратарские перчатки',
        null,
        'https://lh5.googleusercontent.com/proxy/M6uKOSUtUcsDLBeBZuVR30zVUml_o2mmb2_HblczTm9XlSm_9jy5ka8SIPMlTC-mHsi4cWrEQvSpyu7dmKlNTJkl9UrJXyF59yVyD5FjdAd4JVwj5dw9XaVbyHgL_3M',
        '/api/page/10',
        2),
       (9,
        'Гетры и гольфы',
        null,
        'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSlrR5l23OTz8mEhzwE00fAwkCkrxnCLYIKSQ&s',
        '/api/page/11',
        2),
       (10,
        'Куртки и ветровки',
        null,
        'https://www.fan.ru/f/_cat/1_7066.webp',
        '/api/page/8',
        4),
       (11,
        'Брюки',
        null,
        'https://lh5.googleusercontent.com/proxy/M6uKOSUtUcsDLBeBZuVR30zVUml_o2mmb2_HblczTm9XlSm_9jy5ka8SIPMlTC-mHsi4cWrEQvSpyu7dmKlNTJkl9UrJXyF59yVyD5FjdAd4JVwj5dw9XaVbyHgL_3M',
        '/api/page/9',
        4),
       (12,
        'Джемперы/олимпийки/толстовки/худи',
        null,
        'https://lh5.googleusercontent.com/proxy/M6uKOSUtUcsDLBeBZuVR30zVUml_o2mmb2_HblczTm9XlSm_9jy5ka8SIPMlTC-mHsi4cWrEQvSpyu7dmKlNTJkl9UrJXyF59yVyD5FjdAd4JVwj5dw9XaVbyHgL_3M',
        '/api/page/10',
        4),
       (13,
        'Спортивное бельё',
        null,
        'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSlrR5l23OTz8mEhzwE00fAwkCkrxnCLYIKSQ&s',
        '/api/page/11',
        4),
       (14,
        'Футболки',
        null,
        'https://lh5.googleusercontent.com/proxy/M6uKOSUtUcsDLBeBZuVR30zVUml_o2mmb2_HblczTm9XlSm_9jy5ka8SIPMlTC-mHsi4cWrEQvSpyu7dmKlNTJkl9UrJXyF59yVyD5FjdAd4JVwj5dw9XaVbyHgL_3M',
        '/api/page/8',
        4),
       (15,
        'Шорты',
        null,
        'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSlrR5l23OTz8mEhzwE00fAwkCkrxnCLYIKSQ&s',
        '/api/page/12',
        4);



INSERT INTO menu (id, title, path, parent_id, page_id)
VALUES (1, 'Главная', '/api/page/1', NULL, 1),
       (2, 'Игровая форма', '/api/page/2', NULL, 2),
       (3, 'Обувь', '/api/page/3', NULL, 3),
       (4, 'Одежда', '/api/page/4', NULL, 4),
       (5, 'Мячи', '/api/page/5', NULL, 5),
       (6, 'Аксессуары', '/api/page/6', NULL, 6),
       (7, 'Инвентарь', '/api/page/7', NULL, 7);


INSERT INTO ball (name, price, image_url, size_ball, type, colour, description, material)
VALUES ('Football', 2900.99, 'https://example.com/images/football.jpg', 45, 'Sport', 'White/Black', 'Описание',
        'Leather'),
       ('Basketball', 3900.50, 'https://example.com/images/basketball.jpg', 37, 'Sport', 'Orange', 'Описание',
        'Synthetic'),
       ('Volleyball', 2400.00, 'https://example.com/images/volleyball.jpg', 45, 'Sport', 'White', 'Описание', 'PVC'),
       ('Beach Ball', 9000.99, 'https://example.com/images/beachball.jpg', 39, 'Recreational', 'Multicolor', 'Описание',
        'Plastic');

INSERT INTO shoes (name, price, image_url, size_shoes, type, colour, description, material)
VALUES ('Football', 2900.99, 'https://example.com/images/football.jpg', 45, 'Sport', 'White/Black', 'Описание',
        'Leather'),
       ('Basketball', 3900.50, 'https://example.com/images/basketball.jpg', 37, 'Sport', 'Orange', 'Описание',
        'Synthetic'),
       ('Volleyball', 2400.00, 'https://example.com/images/volleyball.jpg', 45, 'Sport', 'White', 'Описание', 'PVC'),
       ('Beach Ball', 9000.99, 'https://example.com/images/beachball.jpg', 39, 'Recreational', 'Multicolor', 'Описание',
        'Plastic');

INSERT INTO inventory (name, price, image_url, description, colour)
VALUES ('Секундомер', 900.99, 'https://example.com/images/football.jpg', 'Описание', 'White/Black'),
       ('Свисток', 200.50, 'https://example.com/images/basketball.jpg', 'Описание', 'Orange'),
       ('Доска тактическая', 409.00, 'https://example.com/images/volleyball.jpg', 'Описание', 'White'),
       ('Повязка', 9000.99, 'https://example.com/images/beachball.jpg', 'Описание', 'Multicolor');


INSERT INTO accessories (name, price, image_url, size_product, type, colour, description)
VALUES ('Шапка', 2900.99, 'https://example.com/images/football.jpg', 45, 'Sport', 'White/Black', 'Описание'),
       ('Перчатки', 3900.50, 'https://example.com/images/basketball.jpg', 37, 'Sport', 'Orange', 'Описание'),
       ('Носки', 2400.00, 'https://example.com/images/volleyball.jpg', 45, 'Sport', 'White', 'Описание'),
       ('Сумка/Рюкзак', 9000.99, 'https://example.com/images/beachball.jpg', 39, 'Recreational', 'Multicolor',
        'Описание');

INSERT INTO shorts
VALUES (1, 'Sport Shorts Nike', 'sport', 29.99, 'img/shorts1.jpg', 42, 'polyester', 'black',
        'Comfortable sport shorts'),
       (2, 'Adidas Training Shorts', 'training', 34.99, 'img/shorts2.jpg', 44, 'cotton', 'blue',
        'Training shorts for gym');

INSERT INTO tshirts
VALUES (1, 'Nike T-Shirt', 'sport', 19.99, 'img/tshirt1.jpg', 48, 'cotton', 'white', 'logo', 'Classic Nike t-shirt'),
       (2, 'Adidas T-Shirt', 'casual', 21.99, 'img/tshirt2.jpg', 50, 'polyester', 'black', 'print',
        'Comfortable everyday t-shirt');

INSERT INTO protective_cloth
VALUES (1, 'Protective Jacket', 'outdoor', 79.99, 'img/protect1.jpg', 'green', 'L', 'Waterproof protective jacket'),
       (2, 'Safety Vest', 'work', 15.99, 'img/protect2.jpg', 'yellow', 'M', 'High visibility vest');

INSERT INTO gloves
VALUES (1, 'Winter Gloves', 'winter', 25.99, 'img/gloves1.jpg', 'black', 'M', 'Warm winter gloves'),
       (2, 'Sport Gloves', 'fitness', 19.99, 'img/gloves2.jpg', 'red', 'L', 'Gloves for gym training');

INSERT INTO gaiters
VALUES (1, 'Mountain Gaiters', 'outdoor', 35.99, 'img/gaiters1.jpg', 'black', 'L', 'Protects from snow and dirt'),
       (2, 'Hiking Gaiters', 'hiking', 29.99, 'img/gaiters2.jpg', 'green', 'M', 'Durable hiking gaiters');

INSERT INTO jacket (name, price, image_url, size_jacket, material, colour, description)
VALUES ('Winter Jacket Alpha', 120.0, 'img/jacket1.jpg', 'L', 'Polyester', 'Black', 'Warm winter jacket'),
       ('Light Jacket Breeze', 75.5, 'img/jacket2.jpg', 'M', 'Cotton', 'Blue', 'Light spring jacket');

INSERT INTO pants (name, price, image_url, size_pants, material, colour, description)
VALUES ('Classic Pants', 60.0, 'img/pants1.jpg', 'M', 'Cotton', 'Black', 'Comfortable classic pants'),
       ('Sport Pants Pro', 55.0, 'img/pants2.jpg', 'L', 'Polyester', 'Grey', 'Perfect for спорт');

INSERT INTO sweater (name, price, image_url, size_sweater, material, colour, description)
VALUES ('Warm Sweater', 45.0, 'img/sweater1.jpg', 'M', 'Wool', 'Beige', 'Cozy winter sweater'),
       ('Casual Sweater', 40.0, 'img/sweater2.jpg', 'L', 'Cotton', 'Green', 'Daily casual sweater');

INSERT INTO sports_underwear (name, price, image_url, size_sports_underwear, material, colour, description)
VALUES ('Sport Underwear Basic', 25.0, 'img/underwear1.jpg', 'M', 'Elastane', 'Black', 'Breathable underwear'),
       ('Sport Underwear Pro', 30.0, 'img/underwear2.jpg', 'L', 'Polyester', 'White', 'High performance underwear');