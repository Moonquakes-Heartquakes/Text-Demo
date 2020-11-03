package com.example;

import org.csource.fastdfs.*;

public class FastDFSDemo {

    public static void main(String[] args) throws Exception{
        //加载配置文件
        ClientGlobal.init("./src/main/resources/fasf_demo.conf");
        //创建调度服务器客户端对象  new
        TrackerClient trackerClient = new TrackerClient();
        //c创建调度服务器 服务端对象
        TrackerServer trackerServer = trackerClient.getConnection();
        //创建存储服务器端对象 null
        StorageServer storageServer=null;
        //存储服务器  客户端
        StorageClient storageClient = new StorageClient(trackerServer, storageServer);
        //存储服务器客户端调用上传方法
        String[] strings = storageClient.upload_appender_file("C:\\Users\\53052\\Desktop\\1.jpg", "jpg", null);
        for (String string : strings) {
            System.out.println(string);
        }
        System.out.println("上传成功");
    }

}
