# -*- coding:utf-8 -*-
# 유투브에서 영상 가져오기

import cv2
import pafy
import numpy as np

def rescale_frame(frame, scale):    # works for image, video, live video
    width = int(frame.shape[1] * scale)
    height = int(frame.shape[0] * scale)
    dimensions = (width, height)
    return cv2.resize(frame, dimensions, interpolation=cv2.INTER_AREA)

def main():
    url='https://www.youtube.com/watch?v=f2xk-BoZ3tg'
    video = pafy.new(url)

    print('title =', video.title)
    print('video.rating = ',video.rating)
    print('video.duration = ',video.duration)

    best = video.getbest() # video.getbest(preftype='mp4')
    print('best.resolution', best.resolution)

    cap=cv2.VideoCapture(best.url)
    while(True):
        retval, frame = cap.read()
        if not retval:
            break
        cv2.imshow('frame',frame)
       
        kernel_filter2 = np.ones((100, 100), np.float32) / 10000
        img_blurred2 = cv2.filter2D(frame, -1, kernel_filter2)
        gray = cv2.cvtColor(frame, cv2.COLOR_BGR2GRAY)
        # edges = cv2.Canny(gray,100,200)
        cv2.imshow('blur',img_blurred2)

        key = cv2.waitKey(25)
        if key == 27: # Esc
            break
    cv2.destroyAllWindows()

if __name__=="__main__":
    main()