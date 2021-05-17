package com.iu.s1.board.qna;

import com.iu.s1.board.BoardVO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class QnaVO extends BoardVO {

	private Long ref;
	private Long step;
	private Long depth;
	
}
