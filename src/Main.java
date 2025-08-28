import java.util.*;
public static void main(String[] args) {
        PostManager pm = new PostManager();

        System.out.println("═══ Social Media Post Manager ═══");

        String postTitle = "Java Programming Tips";
        int engagementScore = pm.calculateEngagement(150, 75, 25);
        String category = pm.getCategoryRating(engagementScore);

        System.out.println("Post: " + postTitle);
        System.out.println("Engagement Score: " + engagementScore);
        System.out.println("Category: " + category);
        System.out.println();

        String[] hashtags = {"#java", "#coding", "#programming", "#java", "#tips"};
        ArrayList<String> uniqueHashtags = pm.manageHashtags(hashtags);
        System.out.println("Unique Hashtags: " + uniqueHashtags);

        ArrayList<String> posts = new ArrayList<>();
        posts.add("Java Programming Tips");
        posts.add("Advanced Java Tutorial");
        posts.add("Spring Boot Guide");

        HashMap<String, Integer> engagements = new HashMap<>();
        engagements.put("Java Programming Tips", engagementScore);
        engagements.put("Advanced Java Tutorial", 1200);
        engagements.put("Spring Boot Guide", 750);

        LinkedList<String> trending = pm.findTrendingPosts(posts, engagements);
        System.out.println("Trending Posts: " + trending);

        HashSet<String> authors = pm.getUniqueAuthors("Alice", "Bob", "Alice", "Charlie", "Bob");
        System.out.println("Unique Authors: " + authors);
    }
}
