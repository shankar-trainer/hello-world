import java.util.Date;

public class Post {

	private int postId;
	private String  postName;
	private Date postDate;
	
	private Comment comments[];

	int getPostId() {
		return postId;
	}


	String getPostName() {
		return postName;
	}


	Date getPostDate() {
		return postDate;
	}


	Comment[] getComments() {
		return comments;
	}


	public Post(int postId, String postName, Date postDate, Comment[] comments) {
		super();
		this.postId = postId;
		this.postName = postName;
		this.postDate = postDate;
		this.comments = comments;
	}
	
	
	
	
	
}
