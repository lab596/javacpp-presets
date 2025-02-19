// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.onnxruntime;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.opencl.*;
import static org.bytedeco.opencl.global.OpenCL.*;
import org.bytedeco.dnnl.*;
import static org.bytedeco.dnnl.global.dnnl.*;

import static org.bytedeco.onnxruntime.global.onnxruntime.*;

@Name("Ort::Base<OrtModelMetadata>") @NoOffset @Properties(inherit = org.bytedeco.onnxruntime.presets.onnxruntime.class)
public class BaseModelMetadata extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BaseModelMetadata(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public BaseModelMetadata(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public BaseModelMetadata position(long position) {
        return (BaseModelMetadata)super.position(position);
    }
    @Override public BaseModelMetadata getPointer(long i) {
        return new BaseModelMetadata((Pointer)this).offsetAddress(i);
    }


  public BaseModelMetadata() { super((Pointer)null); allocate(); }
  private native void allocate();
  public BaseModelMetadata(OrtModelMetadata p) { super((Pointer)null); allocate(p); }
  private native void allocate(OrtModelMetadata p);

  public native @Name("operator OrtModelMetadata*") OrtModelMetadata asOrtModelMetadata();

  /** \brief Releases ownership of the contained pointer */
  public native OrtModelMetadata release();
}
