package cc.wxyun.yunpan.service;

import cc.wxyun.yunpan.entity.Folder;
import cc.wxyun.yunpan.entity.mapper.FolderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FolderService {

    @Autowired
    private FolderMapper folderMapper;


    /**
     * 根据id查询文件夹
     * @param id
     * @return
     */
    public Folder getById(int id){
        return folderMapper.selectByPrimaryKey(id);
    }


    /**
     * 查询所有文件夹
     * @return
     */
    public List<Folder> listAll(){
        return folderMapper.listAll();
    }

    /**
     * 查询pid下的文件夹
     * @param pid
     * @return
     */
    public List<Folder> listAll(int pid){
        return folderMapper.listByPid(pid);
    }

    /**
     * 保存文件夹
     * @param folder
     */
    public void saveFolder(Folder folder){
        folderMapper.insertSelective(folder);
    }

    /**
     * 修改文件夹
     * @param folder
     */
    public void updateFolder(Folder folder){
        folderMapper.updateByPrimaryKeySelective(folder);
    }

    /**
     * 根据id删除文件夹
     * @param id
     * @return
     */
    public void deleteById(int id){
        folderMapper.deleteByPrimaryKey(id);
    }

    /**
     * 根据id批量删除文件夹
     * @param ids
     * @return
     */
    public void batchDeleteById(List<Integer> ids){
        folderMapper.batchDeleteByPrimaryKey(ids);
    }
}
