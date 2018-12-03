package telran.forum.model;
import java.util.List;

import org.joda.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@EqualsAndHashCode(of = {"id","author"})
@ToString
@Builder
public class Post {
	@Setter
	int id;
	@Setter
	String title;
	@Setter
	String content;
	@Setter
	String author;
	LocalDate date;
	@Setter
	List<String> tags;
	@Setter
	byte likes;
/*
 * "id": "Post id",
  "title": "Title of post",
  "content": "Post content",
  "author": "Author of post",
  "dateCreated": "DateTime",
  "tags": [
    "tag1",
    "tag2",
    "tag3"
  ],
  "likes": "Total likes",
 */
}
