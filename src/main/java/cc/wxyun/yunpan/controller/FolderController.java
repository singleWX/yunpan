package cc.wxyun.yunpan.controller;

import cc.wxyun.yunpan.entity.Folder;
import cc.wxyun.yunpan.service.FolderService;
import cc.wxyun.yunpan.util.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 文件夹
 */
@RestController
@RequestMapping("/folder")
public class FolderController {

    @Autowired
    private FolderService folderService;

    @RequestMapping("/listAll")
    @CrossOrigin
    public ApiResponse listAll(){
        return ApiResponse.success(folderService.listAll());
    }

    @RequestMapping("/saveFolder")
    @CrossOrigin
    public ApiResponse saveFolder(Folder folder){
        try{
            folderService.saveFolder(folder);
            return ApiResponse.success();
        }catch (Exception e){
            e.printStackTrace();
            return ApiResponse.error(e.getMessage());
        }
    }

    @RequestMapping("/updateFolder")
    @CrossOrigin
    public ApiResponse updateFolder(Folder folder){
        try{
            folderService.updateFolder(folder);
            return ApiResponse.success();
        }catch (Exception e){
            e.printStackTrace();
            return ApiResponse.error(e.getMessage());
        }
    }

    @RequestMapping("/listChilds")
    @CrossOrigin
    public ApiResponse listChilds(int pid){
        return ApiResponse.success(folderService.listAll(pid));
    }


    @RequestMapping("/remove")
    @CrossOrigin
    public ApiResponse remove(int id){
        folderService.deleteById(id);
        return ApiResponse.success();
    }


    @RequestMapping("/batchRemove")
    public ApiResponse batchRemove(List<Integer> ids){
        folderService.batchDeleteById(ids);
        return ApiResponse.success();
    }

}
