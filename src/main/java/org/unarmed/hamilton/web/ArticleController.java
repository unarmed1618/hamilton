package org.unarmed.hamilton.web;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.unarmed.hamilton.model.Article;

@RestController
public class ArticleController {
	private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping("/articles")
	public Article getArticle(@RequestParam(value="name", defaultValue="Nobody Home") String name){
		return new Article(
				counter.incrementAndGet(),
				String.format("slander and lies about %s", name)
				);
	}
}
