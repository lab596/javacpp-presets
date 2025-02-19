// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.depthai;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;

import static org.bytedeco.depthai.global.depthai.*;

/**
 * System information of device
 *
 * Memory usage, cpu usage and chip temperature
 */
@Namespace("dai") @NoOffset @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class RawSystemInformation extends RawBuffer {
    static { Loader.load(); }
    /** Default native constructor. */
    public RawSystemInformation() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public RawSystemInformation(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RawSystemInformation(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public RawSystemInformation position(long position) {
        return (RawSystemInformation)super.position(position);
    }
    @Override public RawSystemInformation getPointer(long i) {
        return new RawSystemInformation((Pointer)this).offsetAddress(i);
    }

    /** DDR memory usage */
    public native @ByRef MemoryInfo ddrMemoryUsage(); public native RawSystemInformation ddrMemoryUsage(MemoryInfo setter);
    /** CMX memory usage */
    public native @ByRef MemoryInfo cmxMemoryUsage(); public native RawSystemInformation cmxMemoryUsage(MemoryInfo setter);
    /** LeonCss heap usage */
    public native @ByRef MemoryInfo leonCssMemoryUsage(); public native RawSystemInformation leonCssMemoryUsage(MemoryInfo setter);
    /** LeonMss heap usage */
    public native @ByRef MemoryInfo leonMssMemoryUsage(); public native RawSystemInformation leonMssMemoryUsage(MemoryInfo setter);
    /** LeonCss cpu usage */
    public native @ByRef CpuUsage leonCssCpuUsage(); public native RawSystemInformation leonCssCpuUsage(CpuUsage setter);
    /** LeonMss cpu usage */
    public native @ByRef CpuUsage leonMssCpuUsage(); public native RawSystemInformation leonMssCpuUsage(CpuUsage setter);
    /** Chip temperatures */
    public native @ByRef ChipTemperature chipTemperature(); public native RawSystemInformation chipTemperature(ChipTemperature setter);

    public native @Override void serialize(@Cast("std::uint8_t*") @StdVector BytePointer metadata, @ByRef @Cast("dai::DatatypeEnum*") IntPointer datatype);
    public native @Override void serialize(@Cast("std::uint8_t*") @StdVector ByteBuffer metadata, @ByRef @Cast("dai::DatatypeEnum*") IntBuffer datatype);
    public native @Override void serialize(@Cast("std::uint8_t*") @StdVector byte[] metadata, @ByRef @Cast("dai::DatatypeEnum*") int[] datatype);
}
