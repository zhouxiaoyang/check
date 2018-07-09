package com.checkpoint.check.controller;

import com.checkpoint.check.dataVo.ResultVo;
import com.checkpoint.check.form.NoteForm;
import com.checkpoint.check.util.FileUtil;
import com.checkpoint.check.util.JsonUtil;
import com.checkpoint.check.util.ResultVoUtil;
import com.checkpoint.check.util.UuidUtil;
import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 笔录controller
 */
@RestController
@Slf4j
@RequestMapping("notes")
public class NoteController {

    /**
     * 笔录列表
     */
    @GetMapping("/list")
    public ResultVo getList() {
        log.info("获取笔录列表....");
        int size = 0;
        String[] fileNames = FileUtil.fileNames("");
        if (null != fileNames) size = fileNames.length;
        String[] files;
        Map<String, Object> data = new HashMap<String, Object>();
        data.put("sum", size);
        if (size > 10) {
            files = Arrays.copyOfRange(fileNames, 0, 9);
        } else {
            files = fileNames;
        }
        List list = FileUtil.getFileInfoList(files);
        data.put("noteData", list);

        return ResultVoUtil.success(data);
    }

    /**
     * 生成一个笔录文件
     *
     * @param noteForm
     */
    @PostMapping(path="/save")
    public ResultVo saveNote(NoteForm noteForm) {
        //@RequestBody Map<String,String> map
        String id = UuidUtil.getUuid();
        log.info("生成笔录文件  " + id + ".txt");
        //String noteInfo = JsonUtil.toJson(map);
        noteForm.setId(id);
        String noteInfo = JsonUtil.toJson(noteForm);
        FileUtil.writeToFile(id, noteInfo);

        return ResultVoUtil.success();
    }

    /**
     * @return
     */
    @PostMapping(path="/update")
    public ResultVo updateNote(NoteForm noteForm) {
        String id = noteForm.getId();
        //String id=map.get("id");
        log.info("修改笔录文件"+id+".txt");
        String noteInfo = JsonUtil.toJson(noteForm);
        //log.info("格式化后的json:"+noteInfo);
        FileUtil.updateFileInfo(id, noteInfo);
        return ResultVoUtil.success();
    }

    /**
     * 笔录详情
     *
     * @param noteId
     * @return
     */
    @PostMapping("/info")
    public ResultVo noteInfo(String noteId) {
        if (null == noteId) {
            log.error("参数错误!!!");
            return ResultVoUtil.other();
        }
        //String noteId=map.get("noteId");
        log.info("查看"+noteId+".txt 笔录文件!");
        String info = FileUtil.readToString(noteId + ".txt");
        Gson gson = new Gson();
        NoteForm noteForm = gson.fromJson(info, NoteForm.class);
        return ResultVoUtil.success(noteForm);
    }


}
