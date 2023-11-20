package cvut.fel.service;

import cvut.fel.entity.FileproofArticle;

public interface FileproofArticleService {

    Iterable<FileproofArticle> findAll();

    FileproofArticle findById(Long id);

    FileproofArticle save(String correctionText, int correctionFile);

    FileproofArticle delete(Long id);

    FileproofArticle update(Long id, String correctionText, int correctionFile);
}
