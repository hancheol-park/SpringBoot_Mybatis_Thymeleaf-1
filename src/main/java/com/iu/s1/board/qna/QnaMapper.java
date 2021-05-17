package com.iu.s1.board.qna;

import com.iu.s1.board.BoardMapper;
import com.iu.s1.board.BoardVO;

public interface QnaMapper extends BoardMapper {
	
	public int setReplyInsert(BoardVO boardVO)throws Exception;
	
	public int setReplyUpdate(BoardVO boardVO)throws Exception;
	
	public int setRefUpate(BoardVO boardVO)throws Exception;
	

}
