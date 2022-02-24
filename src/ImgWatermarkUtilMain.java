import org.opencv.core.Core;
import org.opencv.core.Mat;

import static org.opencv.highgui.Highgui.imread;
import static org.opencv.highgui.Highgui.imwrite;

/**
 * @author yangxiaohui
 * @Date: Create by 2018-10-25 19:42
 * @Description:
 */
public class ImgWatermarkUtilMain {
    static{
        //加载opencv动态库
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
    }
    public static void main(String[] args){
        Mat img = imread("D:\\stzz.jpg");//加载图片
        Mat outImg = ImgWatermarkUtil.addImageWatermarkWithText(img,"testwatermark");
        imwrite("D:\\stzz-out.jpg",outImg);//保存加过水印的图片
        //读取图片水印
        Mat watermarkImg = ImgWatermarkUtil.getImageWatermarkWithText(outImg);
        imwrite("D:\\stzz-watermark.jpg",watermarkImg);//保存获取到的水印
    }

}