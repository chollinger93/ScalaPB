// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.google.protobuf.`type`

/** A protocol buffer option, which can be attached to a message, field,
  * enumeration, etc.
  *
  * @param name
  *   The option's name. For protobuf built-in options (options defined in
  *   descriptor.proto), this is the short name. For example, `"map_entry"`.
  *   For custom options, it should be the fully-qualified name. For example,
  *   `"google.api.http"`.
  * @param value
  *   The option's value packed in an Any message. If the value is a primitive,
  *   the corresponding wrapper type defined in google/protobuf/wrappers.proto
  *   should be used. If the value is an enum, it should be stored as an int32
  *   value using the google.protobuf.Int32Value type.
  */
@SerialVersionUID(0L)
final case class OptionProto(
    name: _root_.scala.Predef.String = "",
    value: _root_.scala.Option[com.google.protobuf.any.Any] = _root_.scala.None,
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
    ) extends scalapb.GeneratedMessage with scalapb.Message[OptionProto] with scalapb.lenses.Updatable[OptionProto] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = name
        if (__value != "") {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
        }
      };
      if (value.isDefined) {
        val __value = value.get
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      };
      __size += unknownFields.serializedSize
      __size
    }
    override def serializedSize: _root_.scala.Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
      {
        val __v = name
        if (__v != "") {
          _output__.writeString(1, __v)
        }
      };
      value.foreach { __v =>
        val __m = __v
        _output__.writeTag(2, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      unknownFields.writeTo(_output__)
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.protobuf.`type`.OptionProto = {
      var __name = this.name
      var __value = this.value
      val _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder(this.unknownFields)
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __name = _input__.readString()
          case 18 =>
            __value = Option(_root_.scalapb.LiteParser.readMessage(_input__, __value.getOrElse(com.google.protobuf.any.Any.defaultInstance)))
          case tag => _unknownFields__.parseField(tag, _input__)
        }
      }
      com.google.protobuf.`type`.OptionProto(
          name = __name,
          value = __value,
          unknownFields = _unknownFields__.result()
      )
    }
    def withName(__v: _root_.scala.Predef.String): OptionProto = copy(name = __v)
    def getValue: com.google.protobuf.any.Any = value.getOrElse(com.google.protobuf.any.Any.defaultInstance)
    def clearValue: OptionProto = copy(value = _root_.scala.None)
    def withValue(__v: com.google.protobuf.any.Any): OptionProto = copy(value = Option(__v))
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = name
          if (__t != "") __t else null
        }
        case 2 => value.orNull
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PString(name)
        case 2 => value.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.protobuf.`type`.OptionProto
}

object OptionProto extends scalapb.GeneratedMessageCompanion[com.google.protobuf.`type`.OptionProto] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.google.protobuf.`type`.OptionProto] = this
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.protobuf.`type`.OptionProto] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.google.protobuf.`type`.OptionProto(
        name = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        value = __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).flatMap(_.as[_root_.scala.Option[com.google.protobuf.any.Any]])
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = TypeProto.javaDescriptor.getMessageTypes.get(4)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = TypeProto.scalaDescriptor.messages(4)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 2 => __out = com.google.protobuf.any.Any
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.google.protobuf.`type`.OptionProto(
    name = "",
    value = _root_.scala.None
  )
  implicit class OptionProtoLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.`type`.OptionProto]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.google.protobuf.`type`.OptionProto](_l) {
    def name: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.name)((c_, f_) => c_.copy(name = f_))
    def value: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.any.Any] = field(_.getValue)((c_, f_) => c_.copy(value = Option(f_)))
    def optionalValue: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[com.google.protobuf.any.Any]] = field(_.value)((c_, f_) => c_.copy(value = f_))
  }
  final val NAME_FIELD_NUMBER = 1
  final val VALUE_FIELD_NUMBER = 2
  def of(
    name: _root_.scala.Predef.String,
    value: _root_.scala.Option[com.google.protobuf.any.Any],
    unknownFields: _root_.scalapb.UnknownFieldSet
  ): _root_.com.google.protobuf.`type`.OptionProto = _root_.com.google.protobuf.`type`.OptionProto(
    name,
    value,
    unknownFields
  )
}
