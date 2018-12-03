package cc.wxyun.yunpan.entity.mapper;

import cc.wxyun.yunpan.entity.Folder;

import java.util.List;

public interface FolderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Folder record);

    int insertSelective(Folder record);

    Folder selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Folder record);

    int updateByPrimaryKey(Folder record);

    List<Folder> listAll();

    List<Folder> listByPid(int pid);

    int batchDeleteByPrimaryKey(List<Integer> ids);
}