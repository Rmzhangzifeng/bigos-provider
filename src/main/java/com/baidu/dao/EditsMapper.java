package com.baidu.dao;


import org.apache.ibatis.annotations.Param;
import com.baidu.pojo.Edits;

import java.util.List;

public interface EditsMapper {
    List<Edits> queryedits(@Param("editpid") int editpid);
}