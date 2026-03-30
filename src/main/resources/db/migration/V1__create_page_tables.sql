CREATE TABLE contact_info
(
    id       BIGINT PRIMARY KEY,
    phone    VARCHAR(50),
    email    VARCHAR(100),
    address  VARCHAR(255),
    telegram VARCHAR(100),
    vk       VARCHAR(100)
);

CREATE TABLE filter_param
(
    id      BIGINT PRIMARY KEY,
    filters JSON NOT NULL
);

CREATE TABLE page
(
    id              BIGINT PRIMARY KEY,
    page_name       VARCHAR(100),
    contact_info_id BIGINT,
    filter_id       BIGINT,

    CONSTRAINT fk_page_contact
        FOREIGN KEY (contact_info_id)
            REFERENCES contact_info (id)
            ON DELETE CASCADE,
    CONSTRAINT fk_filter_param FOREIGN KEY (filter_id) REFERENCES filter_param (id)
);

CREATE TABLE product
(
    id        BIGINT PRIMARY KEY,
    name      VARCHAR(255),
    price     DOUBLE PRECISION,
    image_url VARCHAR(500),
    path      VARCHAR(255),
    page_id   BIGINT,

    CONSTRAINT fk_product_page
        FOREIGN KEY (page_id)
            REFERENCES page (id)
            ON DELETE CASCADE
);

CREATE TABLE menu
(
    id        BIGINT PRIMARY KEY,
    title     VARCHAR(100),
    path      VARCHAR(255),
    page_id   BIGINT,
    parent_id BIGINT,

    CONSTRAINT fk_menu_parent
        FOREIGN KEY (parent_id)
            REFERENCES menu (id)
            ON DELETE CASCADE
);

CREATE TABLE ball
(
    id          BIGSERIAL PRIMARY KEY,
    name        VARCHAR(255)     NOT NULL,
    price       DOUBLE PRECISION NOT NULL,
    image_url   VARCHAR(512)     NOT NULL,
    size_ball   INTEGER          NOT NULL,
    type        VARCHAR(100)     NOT NULL,
    colour      VARCHAR(50)      NOT NULL,
    description VARCHAR(512)     NOT NULL,
    material    VARCHAR(100)     NOT NULL
);

CREATE TABLE shoes
(
    id          BIGSERIAL PRIMARY KEY,
    name        VARCHAR(255)     NOT NULL,
    price       DOUBLE PRECISION NOT NULL,
    image_url   VARCHAR(512)     NOT NULL,
    size_shoes  INTEGER          NOT NULL,
    type        VARCHAR(100)     NOT NULL,
    colour      VARCHAR(50)      NOT NULL,
    description VARCHAR(512)     NOT NULL,
    material    VARCHAR(100)     NOT NULL
);

CREATE TABLE inventory
(
    id          BIGSERIAL PRIMARY KEY,
    name        VARCHAR(255)     NOT NULL,
    price       DOUBLE PRECISION NOT NULL,
    image_url   VARCHAR(512)     NOT NULL,
    description VARCHAR(512)     NOT NULL,
    colour      VARCHAR(50)      NOT NULL
);

CREATE TABLE accessories
(
    id           BIGSERIAL PRIMARY KEY,
    name         VARCHAR(255)     NOT NULL,
    price        DOUBLE PRECISION NOT NULL,
    image_url    VARCHAR(512)     NOT NULL,
    size_product INTEGER          NOT NULL,
    type         VARCHAR(100)     NOT NULL,
    colour       VARCHAR(50)      NOT NULL,
    description  VARCHAR(512)     NOT NULL
);

CREATE TABLE shorts
(
    id          BIGINT PRIMARY KEY,
    name        VARCHAR(255)     NOT NULL,
    type        VARCHAR(100)     NOT NULL,
    price       DOUBLE PRECISION NOT NULL,
    image_url   VARCHAR(500)     NOT NULL,
    size_shorts INT              NOT NULL,
    material    VARCHAR(100)     NOT NULL,
    colour      VARCHAR(100)     NOT NULL,
    description TEXT             NOT NULL
);

CREATE TABLE tshirts
(
    id            BIGINT PRIMARY KEY,
    name          VARCHAR(255)     NOT NULL,
    type          VARCHAR(100)     NOT NULL,
    price         DOUBLE PRECISION NOT NULL,
    image_url     VARCHAR(500)     NOT NULL,
    size_t_shirts INT              NOT NULL,
    material      VARCHAR(100)     NOT NULL,
    colour        VARCHAR(100)     NOT NULL,
    print_type    VARCHAR(100)     NOT NULL,
    description   TEXT             NOT NULL
);

CREATE TABLE protective_cloth
(
    id           BIGINT PRIMARY KEY,
    name         VARCHAR(255)     NOT NULL,
    type         VARCHAR(100)     NOT NULL,
    price        DOUBLE PRECISION NOT NULL,
    image_url    VARCHAR(500)     NOT NULL,
    colour       VARCHAR(100)     NOT NULL,
    size_product VARCHAR(50)      NOT NULL,
    description  TEXT             NOT NULL
);

CREATE TABLE gloves
(
    id          BIGINT PRIMARY KEY,
    name        VARCHAR(255)     NOT NULL,
    type        VARCHAR(100)     NOT NULL,
    price       DOUBLE PRECISION NOT NULL,
    image_url   VARCHAR(500)     NOT NULL,
    colour      VARCHAR(100)     NOT NULL,
    size_gloves VARCHAR(50)      NOT NULL,
    description TEXT             NOT NULL
);

CREATE TABLE gaiters
(
    id           BIGINT PRIMARY KEY,
    name         VARCHAR(255)     NOT NULL,
    type         VARCHAR(100)     NOT NULL,
    price        DOUBLE PRECISION NOT NULL,
    image_url    VARCHAR(500)     NOT NULL,
    colour       VARCHAR(100)     NOT NULL,
    size_product VARCHAR(50)      NOT NULL,
    description  TEXT             NOT NULL
);

CREATE TABLE jacket
(
    id          BIGSERIAL PRIMARY KEY,
    name        VARCHAR(255)     NOT NULL,
    price       DOUBLE PRECISION NOT NULL,
    image_url   VARCHAR(500)     NOT NULL,
    size_jacket VARCHAR(50)      NOT NULL,
    material    VARCHAR(100)     NOT NULL,
    colour      VARCHAR(100)     NOT NULL,
    description TEXT             NOT NULL
);

CREATE TABLE pants
(
    id          BIGSERIAL PRIMARY KEY,
    name        VARCHAR(255)     NOT NULL,
    price       DOUBLE PRECISION NOT NULL,
    image_url   VARCHAR(500)     NOT NULL,
    size_pants  VARCHAR(50)      NOT NULL,
    material    VARCHAR(100)     NOT NULL,
    colour      VARCHAR(100)     NOT NULL,
    description TEXT             NOT NULL
);

CREATE TABLE sweater
(
    id           BIGSERIAL PRIMARY KEY,
    name         VARCHAR(255)     NOT NULL,
    price        DOUBLE PRECISION NOT NULL,
    image_url    VARCHAR(500)     NOT NULL,
    size_sweater VARCHAR(50)      NOT NULL,
    material     VARCHAR(100)     NOT NULL,
    colour       VARCHAR(100)     NOT NULL,
    description  TEXT             NOT NULL
);

CREATE TABLE sports_underwear
(
    id                    BIGSERIAL PRIMARY KEY,
    name                  VARCHAR(255)     NOT NULL,
    price                 DOUBLE PRECISION NOT NULL,
    image_url             VARCHAR(500)     NOT NULL,
    size_sports_underwear VARCHAR(50)      NOT NULL,
    material              VARCHAR(100)     NOT NULL,
    colour                VARCHAR(100)     NOT NULL,
    description           TEXT             NOT NULL
);
