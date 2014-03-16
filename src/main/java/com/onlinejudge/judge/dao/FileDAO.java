package com.onlinejudge.judge.dao;

import com.onlinejudge.judge.domain.File;

public interface FileDAO {

	public File getFileById(Long id);

	public void addFile(File file);

	public void deleteFileById(Long id);

	public void updateFile(File file);
}
