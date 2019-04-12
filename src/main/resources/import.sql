-- Insert Query:
-- ==============insert users=============================
INSERT INTO USER VALUES(1, 'admin@email.com','admin','admin');
INSERT INTO USER VALUES(2, 'user@email.com','user','user');
INSERT INTO USER VALUES(3, 'test@email.com','test','test');

-- ==============insert users=============================
INSERT INTO POST VALUES(1, 'first body content....', 'First post title', '1' );
INSERT INTO POST VALUES(2, 'Lorem ipsum dolor sit amet consectetur adipisicing elit. Modi pariatur aliquid temporibus dignissimos eveniet odio laboriosam perferendis iste doloremque sapiente neque alias est ullam quos eius cum, accusantium sit non.', 'First post title', '2');
INSERT INTO POST VALUES(3, 'Lorem ipsum dolor sit amet consectetur adipisicing elit. Modi pariatur aliquid temporibus dignissimos eveniet odio laboriosam perferendis iste doloremque sapiente neque alias est ullam quos eius cum, accusantium sit non.', 'Second post title', '1');
INSERT INTO POST VALUES(4, 'Lorem ipsum dolor sit amet consectetur adipisicing elit. Modi pariatur aliquid temporibus dignissimos eveniet odio laboriosam perferendis iste doloremque sapiente neque alias est ullam quos eius cum, accusantium sit non.', 'Third post title', '2');

-- Select Query:
-- ===========================================
select * from user;