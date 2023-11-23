package io.apex.f1.data

import io.apex.f1.enums._
import io.apex.f1.packets.Packet

case class WeatherForecastSample(sessionType: SessionType,
                                 timeOffset: Short,
                                 weather: Weather,
                                 trackTemperature: Short,
                                 airTemperature: Short) {
  //  def fill(buffer: ByteBuf): WeatherForecastSample = {
  //    val sessionType = SessionType.valueOf(buffer.readUnsignedByte())
  //    val timeOffset = buffer.readUnsignedByte()
  //    val weather = Weather.valueOf(buffer.readUnsignedByte())
  //    val trackTemperature = buffer.readByte()
  //    val airTemperature = buffer.readByte()
  //    WeatherForecastSample(sessionType, timeOffset, weather, trackTemperature, airTemperature)
  //  }
  //
  //  def fillBuffer(weatherForecastSample: WeatherForecastSample, buffer: ByteBuf): ByteBuf = {
  //    buffer.writeByte(weatherForecastSample.sessionType.getValue())
  //    buffer.writeByte(weatherForecastSample.timeOffset)
  //    buffer.writeByte(weatherForecastSample.weather.getValue())
  //    buffer.writeByte(weatherForecastSample.trackTemperature)
  //    buffer.writeByte(weatherForecastSample.airTemperature)
  //  }

  override def toString: String = {
    s"WeatherForecastSample[sessionType=$sessionType, timeOffset=$timeOffset, weather=$weather, trackTemperature=$trackTemperature, airTemperature=$airTemperature]"
  }
}

object WeatherForecastSample extends Packet {
  override def size: Int = 5
}
