package com.baidu.service.impl;

import com.baidu.dao.EditsMapper;
import com.baidu.pojo.Edits;
import com.baidu.service.EditsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EditsServiceImpl implements EditsService {
    @Autowired
    private EditsMapper editsMapper;

    @Override
    public List<Edits> queryedits(int editpid) {

        return editsMapper.queryedits(editpid);
    }
}
