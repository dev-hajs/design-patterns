package com.study.designpatterns._02_structural_patterns._09_decorator._02_after;

public class App {

    private static boolean ENABLED_SPAM_FILTER = true;

    private static boolean ENABLED_TRIMMING = true;

    public static void main(String[] args) {
        CommentService commentService = new DefaultCommentService();

        if (ENABLED_SPAM_FILTER) {
            commentService = new SpamFilteringCommentDecorator(commentService);
        }
        if (ENABLED_TRIMMING) {
            commentService = new TrimmingCommentDecorator(commentService);
        }

        Client client = new Client(commentService);
        client.writeComment("오징어게임");
        client.writeComment("보는게 하는거 보다 재밌을 수가 없지...");
        client.writeComment("http://blog.hajs.me");
    }
}
