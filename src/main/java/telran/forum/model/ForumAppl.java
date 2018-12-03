package telran.forum.model;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ForumAppl {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		byte[] jsonData = Files.readAllBytes(Paths.get("Post.json"));
		ObjectMapper mapper = new ObjectMapper();
		JsonNode rootNode = mapper.readTree(jsonData);
		JsonNode idNode = rootNode.path("id");
		JsonNode titleNode = rootNode.path("title");
		JsonNode contentNode = rootNode.path("content");
		JsonNode authorNode = rootNode.path("author");
		JsonNode likesNode = rootNode.path("likes");
		JsonNode tagsNosNode = rootNode.path("tags");
		Iterator<JsonNode> elements = tagsNosNode.elements();
		List<String> tags = new ArrayList<>();
		while(elements.hasNext()){
			JsonNode tag = elements.next();
			tags.add(tag.asText());
		}
		JsonNode dateNode = rootNode.path("dateCreated");
		LocalDate date = LocalDate.parse(dateNode.asText(), DateTimeFormat.forPattern("dd-MM-yyyy")); 
		Post post = Post.builder()
				.id(idNode.asInt())
				.title(titleNode.asText())
				.content(contentNode.asText())
				.author(authorNode.asText())
				.date(date)
				.tags(tags)
				.likes((byte) likesNode.asInt())
				.build();	
		System.out.println(post);
	}

}
