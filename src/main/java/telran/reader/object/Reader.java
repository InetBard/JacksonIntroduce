package telran.reader.object;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Reader {
	int id;
	String name;
	int birthDate;
	// String[] loveBooks;
	List<String> loveBooks;

	@JsonIgnore
	public String getMostLovedBook() {
		// return loveBooks[0];
		return loveBooks.get(0);
	}
	/*
	 * {
  "id": "Post id",
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
  "comments": [
    {
      "user": "username",
      "message": "text",
      "dateCreated": "DateTime",
      "likes": "total likes"
    },
    {
      "user": "username",
      "message": "text",
      "dateCreated": "DateTime",
      "likes": "total likes"
    }
  ]
}
	 */
	// public Reader() {
	//
	// }

	// public Reader(int id, String name, int birthDate, List<String> loveBooks) {
	// this.id = id;
	// this.name = name;
	// this.birthDate = birthDate;
	// this.loveBooks = loveBooks;
	// }

	// public int getId() {
	// return id;
	// }
	//
	// public String getName() {
	// return name;
	// }
	//
	// public int getBirthDate() {
	// return birthDate;
	// }
	//
	// public List<String> getLoveBooks() {
	// return loveBooks;
	// }
	//
	//
	//
	// @Override
	// public String toString() {
	// return "Reader [id=" + id + ", name=" + name + ", birthDate=" + birthDate +
	// ", loveBooks=" + loveBooks + "]";
	// }

}
