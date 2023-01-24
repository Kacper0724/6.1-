package com.kodilla.testing.forum.statistics;

public class StatisticsApp {
    double users;
    double posts;
    double comments;
    double averagePostsUser;
    double averageCommentsUser;
    double averageCommentsPost;

    public void calculateAdvStatistics(Statistics statistics) {
        users = statistics.userName().size();
        posts = statistics.postsCount();
        comments = statistics.commentsCount();

        if (users != 0) {
            averagePostsUser = posts / users;
            averageCommentsUser = comments / users;
        } else {
            averagePostsUser = 0;
            averageCommentsUser = 0;
        }

        if (posts != 0) {
            averageCommentsPost = comments / posts;
        } else {
            averageCommentsPost = 0;
        }
    }

    public void showStatistics() {
        System.out.println("Number of users: " + users);
        System.out.println("Number of posts: " + posts);
        System.out.println("Number of comments: " + comments);
        System.out.println("Average of posts on user: " + averagePostsUser);
        System.out.println("Average of comments on user: " + averageCommentsUser);
        System.out.println("Average of comments on post: " + averageCommentsPost);
    }
}
