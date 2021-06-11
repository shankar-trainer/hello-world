import java.util.Date;

public class Comment {

	private int commentId;
	private Date commentDate;
	private String  commentText;
	
	public Comment(int commentId, Date commentDate, String commentText) {
		super();
		this.commentId = commentId;
		this.commentDate = commentDate;
		this.commentText = commentText;
	}
	int getCommentId() {
		return commentId;
	}
	Date getCommentDate() {
		return commentDate;
	}
	String getCommentText() {
		return commentText;
	}
	
	
	
	
}
