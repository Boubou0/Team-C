INSERT INTO Article
    (name, state, version)
VALUES
    ('article 1', 1, 1);
INSERT INTO Article
    (name, state, version)
VALUES
    ('article 2', 2, 2);
INSERT INTO Article
    (name, state, version)
VALUES
    ('article 3', 3, 3);
INSERT INTO Article
    (name, state, version)
VALUES
    ('article 4', 1, 4);
INSERT INTO Article
    (name, state, version)
VALUES
    ('article 5', 2, 5);
INSERT INTO Article
    (name, state, version)
VALUES
    ('article 6', 3, 1);

INSERT INTO Author
    (name)
VALUES
    ('Patrick');
INSERT INTO Author
    (name)
VALUES
    ('Bernard');
INSERT INTO Author
    (name)
VALUES
    ('Xavier');
INSERT INTO Author
    (name)
VALUES
    ('Roland');
INSERT INTO Author
    (name)
VALUES
    ('Pierre');

INSERT INTO article_author
    (name, article, author)
VALUES
    (null, 1, 1);
INSERT INTO article_author
    (name, article, author)
VALUES
    (null, 1, 2);
INSERT INTO article_author
    (name, article, author)
VALUES
    (null, 1, 3);
INSERT INTO article_author
    (name, article, author)
VALUES
    (null, 2, 1);
INSERT INTO article_author
    (name, article, author)
VALUES
    (null, 3, 1);
INSERT INTO article_author
    (name, article, author)
VALUES
    (null, 4, 1);
INSERT INTO article_author
    (name, article, author)
VALUES
    (null, 4, 2);
INSERT INTO article_author
    (name, article, author)
VALUES
    (null, 5, 3);
INSERT INTO article_author
    (name, article, author)
VALUES
    (null, 6, 4);

INSERT INTO Corrector
    (name, email, tel)
VALUES
    ('jean', 'jean email', 'jean tel');
INSERT INTO Corrector
    (name, email, tel)
VALUES
    ('jeanne', 'jeanne email', 'jeanne tel');
INSERT INTO Corrector
    (name, email, tel)
VALUES
    ('geremie', 'geremie email', 'geremie tel');
INSERT INTO Corrector
    (name, email, tel)
VALUES
    ('yanne', 'yanne email', 'yanne tel');
INSERT INTO Corrector
    (name, email, tel)
VALUES
    ('philippe', 'philippe email', 'philippe tel');

INSERT INTO File
    (name, label, date)
VALUES
    ('fichier 1', 'fichier 1', NOW());
INSERT INTO File
    (name, label, date)
VALUES
    ('fichier 2', 'fichier 2', NOW());
INSERT INTO File
    (name, label, date)
VALUES
    ('fichier 3', 'fichier 3', NOW());
INSERT INTO File
    (name, label, date)
VALUES
    ('fichier 4', 'fichier 4', NOW());
INSERT INTO File
    (name, label, date)
VALUES
    ('fichier 5', 'fichier 5', NOW());

INSERT INTO fileproof_article
    (name, correction_text, correction_file)
VALUES
    ('proof 1', 'correction', 1);
INSERT INTO fileproof_article
    (name, correction_text, correction_file)
VALUES
    ('proof 2', 'cc', 1);
INSERT INTO fileproof_article
    (name, correction_text, correction_file)
VALUES
    ('proof 3', 'oo', 2);
INSERT INTO fileproof_article
    (name, correction_text, correction_file)
VALUES
    ('proof 4', 'rr', 3);
INSERT INTO fileproof_article
    (name, correction_text, correction_file)
VALUES
    ('proof 5', 'dd', 4);
INSERT INTO fileproof_article
    (name, correction_text, correction_file)
VALUES
    ('proof 6', 'tt', 5);