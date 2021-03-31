package practice;

class News {
	private int newsId; 
	private String postedByUser;
	private String commentByUser;
	private String comment;
	public News(int newsId, String postedByUser, String commentByUser, String comment) {
		this.newsId = newsId; 
		this.postedByUser = postedByUser;
		this.commentByUser = commentByUser;
		this.comment = comment ;
	}
	public int getNewsId() {
		return newsId;
	}
	public void setNewsId(int newsId) {
		this.newsId = newsId;
	}
	public String getPostedByUser() {
		return postedByUser;
	}
	public void setPostedByUser(String postedByUser) {
		this.postedByUser = postedByUser;
	}
	public String getCommentByUser() {
		return commentByUser;
	}
	public void setCommentByUser(String commentByUser) {
		this.commentByUser = commentByUser;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	
	public String toString() {
		return "News [newsID=" + newsId + ", Posted by user=" + postedByUser + ", Commented by user"
				+ commentByUser + ", Comments =" +  comment+ "]";
	
}
