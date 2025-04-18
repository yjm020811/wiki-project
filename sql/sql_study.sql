/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 80041
 Source Host           : localhost:3306
 Source Schema         : sql_study

 Target Server Type    : MySQL
 Target Server Version : 80041
 File Encoding         : 65001

 Date: 18/04/2025 16:50:43
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for ebook
-- ----------------------------
DROP TABLE IF EXISTS `ebook`;
CREATE TABLE `ebook`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `category1_id` bigint(0) NULL DEFAULT NULL,
  `category2_id` bigint(0) NULL DEFAULT NULL,
  `description` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `cover` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `doc_count` int(0) NULL DEFAULT NULL,
  `view_count` int(0) NULL DEFAULT NULL,
  `vote_count` int(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of ebook
-- ----------------------------
INSERT INTO `ebook` VALUES (1, '机器学习基础', 101, 201, '入门级机器学习知识库', 'https://picsum.photos/200/300', 45, 1200, 89);
INSERT INTO `ebook` VALUES (2, '数据库设计', 102, 202, '关系型数据库设计指南', 'https://picsum.photos/200/300', 28, 850, 45);
INSERT INTO `ebook` VALUES (3, 'Web开发实战', 103, 203, '全栈开发项目案例', 'https://picsum.photos/200/300', 63, 2500, 156);
INSERT INTO `ebook` VALUES (4, '数据分析入门', 104, 204, 'Python数据分析教程', 'https://picsum.photos/200/300', 37, 1800, 102);
INSERT INTO `ebook` VALUES (5, '移动端开发', 105, 205, 'Flutter跨平台开发', 'https://picsum.photos/200/300', 52, 3200, 212);

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users`  (
  `user_id` int(0) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `email` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `password_hash` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `registration_date` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP(0),
  `last_login` timestamp(0) NULL DEFAULT NULL,
  `profile_picture_url` varchar(1024) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `bio` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL,
  PRIMARY KEY (`user_id`) USING BTREE,
  UNIQUE INDEX `email`(`email`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES (1, 'AliceWonder', 'alice.wonder@example.com', '5f4dcc3b5aa765d61d8327deb882cf99', '2023-01-01 10:00:00', '2025-02-09 09:00:00', 'https://example.com/images/alice.jpg', 'Loves hiking and photography.');
INSERT INTO `users` VALUES (2, 'BobBuilder', 'bob.builder@example.com', '5f4dcc3b5aa765d61d8327deb882cf99', '2023-02-15 14:30:00', '2025-02-10 14:53:56', 'https://example.com/images/bob.png', 'Enjoys building and DIY projects.');
INSERT INTO `users` VALUES (3, 'CharlieChap', 'charlie.chap@example.com', '5f4dcc3b5aa765d61d8327deb882cf99', '2023-03-22 09:15:00', '2025-02-08 20:45:00', 'https://example.com/images/charlie.gif', 'Avid reader and writer.');
INSERT INTO `users` VALUES (4, 'DianaDiver', 'diana.diver@example.com', '5f4dcc3b5aa765d61d8327deb882cf99', '2023-04-10 16:45:00', '2025-02-07 18:30:00', 'https://example.com/images/diana.jpeg', 'Passionate about marine life.');
INSERT INTO `users` VALUES (5, 'EveExplorer', 'eve.explorer@example.com', '5f4dcc3b5aa765d61d8327deb882cf99', '2023-05-05 11:22:00', '2025-02-10 14:53:59', 'https://example.com/images/eve.bmp', 'Travel enthusiast with a love for adventure.');

SET FOREIGN_KEY_CHECKS = 1;
