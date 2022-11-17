package prj5;
// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those
// who do.
// -- Christopher Cox (chriscox)


/**
 * @author Christopher Cox
 * @version 2022-11-16
 */
public class engagement {
    private int likes;
    private int posts;
    private int followers;
    private int comments;
    private int views;
    public engagement(int likes, int posts, int followers, int comments, int views) {
        this.likes = likes; 
        this.posts = posts;
        this.followers = followers;
        this.comments = comments;
        this.views = views;
    }
    /**
     * @return the likes
     */
    public int getLikes() {
        return likes;
    }
    /**
     * @return the posts
     */
    public int getPosts() {
        return posts;
    }
    /**
     * @return the followers
     */
    public int getFollowers() {
        return followers;
    }
    /**
     * @return the comments
     */
    public int getComments() {
        return comments;
    }
    /**
     * @return the views
     */
    public int getViews() {
        return views;
    }
    
    
    
}
