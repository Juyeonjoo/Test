package class1.ex;

public class MovieReviewMain2 {

    public static void main(String[] args) {
        MoviewReview[] reviews = new MoviewReview[2];

        MoviewReview inception = new MoviewReview();
        inception.title = "인셉션";
        inception.review = "인생은 무한루프";
        reviews[0] = inception;

        MoviewReview aboutTime = new MoviewReview();
        aboutTime.title = "어바웃타임";
        aboutTime.review = "인생 시간 영화";
        reviews[1] = aboutTime;

        for (MoviewReview review : reviews)  {
            System.out.println("영화 제목 : " + review.title + ", 리뷰 : " + review.review );
        }
        
    }
}
