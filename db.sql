DROP DATABASE IF EXISTS text_board;
CREATE DATABASE text_board;
USE text_board;

CREATE TABLE article(
	id INT UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
	regDate DATETIME NOT NULL,
	updateDate DATETIME NOT NULL,
	title CHAR(100) NOT NULL,
	`body` TEXT NOT NULL
);

SELECT *
FROM article;

INSERT INTO article
SET regDate = NOW(),
updateDate = NOW(),
title = CONCAT("제목",RAND()),
`body` = CONCAT("내용",RAND());

CREATE TABLE `member` (
	id INT UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
	regDate DATETIME NOT NULL,
	updateDate DATETIME NOT NULL,
	loginId CHAR(20) NOT NULL,
	loginPw CHAR(200) NOT NULL,
	`name` CHAR(200) NOT NULL
);

# 임시회원
INSERT INTO `member`
SET regDate = NOW(),
updateDate = NOW(),
loginId = 'test1',
loginPw = 'test1',
`name` = '홍길동';

INSERT INTO `member`
SET regDate = NOW(),
updateDate = NOW(),
loginId = 'test2',
loginPw = 'test2',
`name` = '홍길순';

# 게시물 테이블에 memberId 칼러 추가
ALTER TABLE article ADD COLUMN memberId INT(10) UNSIGNED NOT NULL AFTER updateDate;

# 게시물 테이블에 hit 칼러 추가
ALTER TABLE article ADD COLUMN hit INT(10) UNSIGNED NOT NULL AFTER `body`;

# 게시물 추가
INSERT INTO article
SET regDate = NOW(),
updateDate = NOW(),
title = '제목1',
`body` = '내용1',
memberId = 1,
hit = 5;

INSERT INTO article
SET regDate = NOW(),
updateDate = NOW(),
title = '제목2',
`body` = '내용2',
memberId = 1,
hit = 4;

INSERT INTO article
SET regDate = NOW(),
updateDate = NOW(),
title = '제목3',
`body` = '내용3',
memberId = 2,
hit = 3;

INSERT INTO article
SET regDate = NOW(),
updateDate = NOW(),
title = '제목4',
`body` = '내용4',
memberId = 2,
hit = 20;

INSERT INTO article
SET regDate = NOW(),
updateDate = NOW(),
title = '제목5',
`body` = '내용5',
memberId = 2,
hit = 20;


INSERT INTO article
SET regDate = NOW(),
updateDate = NOW(),
title = '제목6',
`body` = '내용6',
memberId = 2,
hit = 20;


INSERT INTO article
SET regDate = NOW(),
updateDate = NOW(),
title = '제목7',
`body` = '내용7',
memberId = 2,
hit = 20;


INSERT INTO article
SET regDate = NOW(),
updateDate = NOW(),
title = '제목8',
`body` = '내용8',
memberId = 2,
hit = 20;


INSERT INTO article
SET regDate = NOW(),
updateDate = NOW(),
title = '제목9',
`body` = '내용9',
memberId = 2,
hit = 20;


INSERT INTO article
SET regDate = NOW(),
updateDate = NOW(),
title = '제목10',
`body` = '내용10',
memberId = 2,
hit = 20;

INSERT INTO article
SET regDate = NOW(),
updateDate = NOW(),
title = '제목11',
`body` = '내용11',
memberId = 2,
hit = 20;

INSERT INTO article
SET regDate = NOW(),
updateDate = NOW(),
title = '제목12',
`body` = '내용12',
memberId = 2,
hit = 20;


INSERT INTO article
SET regDate = NOW(),
updateDate = NOW(),
title = '제목13',
`body` = '내용13',
memberId = 2,
hit = 20;


INSERT INTO article
SET regDate = NOW(),
updateDate = NOW(),
title = '제목14',
`body` = '내용14',
memberId = 2,
hit = 20;