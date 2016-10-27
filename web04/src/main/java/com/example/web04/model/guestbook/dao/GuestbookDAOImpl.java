package com.example.web04.model.guestbook.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.example.web04.model.guestbook.dto.GuestbookDTO;

// 저장소, DAO - 데이터베이스 연동 관련 작업
@Repository
public class GuestbookDAOImpl implements GuestbookDAO {
	
	@Inject
	SqlSession selSession;
	
	@Override
	public List<GuestbookDTO> gbList() {
		List<GuestbookDTO> list=null;
		try {
			selSession.selectList("gbList");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

}
