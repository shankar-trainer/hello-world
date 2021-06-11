import java.util.Date;

public class PostMain {

	public static void main(String[] args) {

		Comment comment[] = new Comment[3];
		comment[0] = new Comment(1, new Date(2021, 07, 01), "good");
		comment[1] = new Comment(2, new Date(2021, 07, 9), "average");
		comment[2] = new Comment(3, new Date(2021, 07, 10), "best");

		Post post = new Post(56656, "html", new Date(2021, 06, 21), comment);

		System.out.println("post values id\tname\tdate");
		System.out.println(post.getPostId()+"  "+post.getPostName()+"  "+post.getPostDate());
		
		System.out.println("\n\t Comments \n");
		for (Comment comment2 : comment) {
			System.out.println("\t"+comment2.getCommentId());
			System.out.println("\t"+comment2.getCommentDate());
			System.out.println("\t"+comment2.getCommentText());
		}
	}
}
