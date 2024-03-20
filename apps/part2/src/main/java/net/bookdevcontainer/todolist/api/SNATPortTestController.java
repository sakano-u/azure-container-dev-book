package net.bookdevcontainer.todolist.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import net.bookdevcontainer.todolist.api.repository.SNATTest;
import net.bookdevcontainer.todolist.api.repository.SNATTestRepository;

@RestController
@RequestMapping("/")
public class SNATPortTestController {

  private static final Logger logger = LoggerFactory.getLogger(SNATPortTestController.class);

  @Autowired // This means to get the bean called repository
  // Which is auto-generated by Spring, we will use it to handle the data
  private SNATTestRepository repository;

  @GetMapping(path = "/all")
  public @ResponseBody Iterable<SNATTest> findAll() {
    logger.info("start");

    return repository.findAll();
  }
}