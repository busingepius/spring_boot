//package com.gegabox.lab3.repository;
//
//import com.gegabox.lab3.entity.Post;
//import org.springframework.stereotype.Repository;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Repository
//public class PostRepositoryImpl implements PostRepository {
//    static List<Post> posts = new ArrayList<Post>(
//            List.of(
//                    new Post(1L, "Post One", "This is the first comment", "Author King"),
//                    new Post(2L, "Post Two", "This is the second post", "Pius The King")
//                    )
//    );
//
//    @Override
//    public List<Post> findPostAll() {
//        return posts;
//    }
//
//    @Override
//    public Post findPostById(long id) {
//        return posts.stream().filter((p)->p.getId() == id).findFirst().orElse(null);
//    }
//
//    @Override
//    public void updatePost(long id,Post post) {
//        posts.set((int) id,post);
//    }
//
//    @Override
//    public void addPost(Post post) {
//        posts.add(post);
//    }
//
//    @Override
//    public void deletePost(long id) {
//        posts.removeIf((p)->p.getId()==id);
//    }
//
////    @Override
////    public void updatePost(long id,Post post) {
////        posts.set(id,post);
////    }
//}
