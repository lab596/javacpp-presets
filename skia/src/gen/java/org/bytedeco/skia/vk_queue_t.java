// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.skia;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.skia.global.Skia.*;

@Opaque @Properties(inherit = org.bytedeco.skia.presets.Skia.class)
public class vk_queue_t extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public vk_queue_t() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public vk_queue_t(Pointer p) { super(p); }
}
