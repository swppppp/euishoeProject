package com.euishoe.board.service;
/**
 * 쇼핑몰 게시판(문의, 리뷰, 공지사항)과 관련된  서비스 인터페이스를 기반으로 구현
 * 
 * @author 전상일
 *
 */

import com.euishoe.board.dao.BoardDao;

public class BoardServiceImpl implements BoardService {
	private BoardDao boardDao;

	public BoardDao getBoardDao() {
		return boardDao;
	}

	public void setBoardDao(BoardDao boardDao) {
		this.boardDao = boardDao;
	}
	
}
