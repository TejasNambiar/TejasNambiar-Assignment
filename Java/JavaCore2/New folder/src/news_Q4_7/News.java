package news_Q4_7;

class News {
	private int newsId;
	private String postedByUser;
	private String commentByUser;
	private String comment;

	public News(int newsId, String postedByUser, String commentByUser, String comment) {
		this.newsId = newsId;
		this.postedByUser = postedByUser;
		this.commentByUser = commentByUser;
		this.comment = comment;
	}

	@Override
	public String toString() {
		return "News {" + "News ID: " + newsId + ", Posted By: '" + postedByUser + '\'' + ", Commented By: '"
				+ commentByUser + '\'' + ", Comment: '" + comment + '\'' + '}';
	}

	public int getNewsId() {
		return newsId;
	}

	public String getPostedByUser() {
		return postedByUser;
	}

	public String getCommentByUser() {
		return commentByUser;
	}

	public String getComment() {
		return comment;
	}
}