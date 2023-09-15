package com.loy.sangeng_demo.mapper;

import com.loy.sangeng_demo.domain.SysMenu;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
* @author echoXiaoDai
* @description 针对表【sys_menu(菜单表)】的数据库操作Mapper
* @createDate 2023-09-05 12:49:10
* @Entity com.loy.sangeng_demo.domain.SysMenu
*/
public interface SysMenuMapper extends BaseMapper<SysMenu> {
    List<String> selectMenuByUserId(Long id);
}




