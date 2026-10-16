INSERT INTO
    Business_Certification (certification_type)
VALUES
    ('Fair Trade Certified'),
    ('Certified B Corporation');

INSERT INTO
    Product_Certification (certification_type)
VALUES
    ('100% Organic'),
    ('Non-GMO verified');

INSERT INTO
    Producer (fullname, address, business_certification_id)
VALUES
    ('Super cool farms', '5 Super Street, Manchester', 1),
    ('Healthy Greens', '456 Farm Street, London', 2);

INSERT INTO
    Product (name, wholeprice, retailprice, origin, description, producer_id, product_certification_id)
VALUES
    ('Yorkshire Tea', 8.50, 14.99, 'Yorkshire','Organic Tea from your local producer!', 1, 1),
    ('Raw Honey', 4.00,8.50,'UK','Unfiltered wild flower honey.', 2, 1),
    ('Special Oats',1.20, 3.50,'Scotland','Gluten-free oats.', 1, 2);

INSERT INTO
    Customer (firstname,surname,address,age)
VALUES
    ('John','Doe','123 Main Street, London', 25),
    ('Jane','Doe','456 Main Street, Manchester', 30);