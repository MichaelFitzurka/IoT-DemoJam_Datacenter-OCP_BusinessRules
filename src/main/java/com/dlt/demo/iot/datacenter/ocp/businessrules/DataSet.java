package com.dlt.demo.iot.datacenter.ocp.businessrules;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "dataSet")
@XmlType(propOrder = {"timestamp", "deviceType", "deviceID", "payload", "required", "average", "errorMessage",
                  "errorCode"})
public class DataSet implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String timestamp;
    private String deviceType;
    private Integer deviceID;
    private Integer payload;
    private Integer required;
    private Float average;
    private String errorMessage;
    private Integer errorCode;

    public DataSet() {
        super();
    }

    public DataSet(final String timestamp, final String deviceType, final Integer deviceID, final Integer payload,
                   final Integer required, final Float average, final String errorMessage, final Integer errorCode) {
        super();
        setTimestamp(timestamp);
        setDeviceType(deviceType);
        setDeviceID(deviceID);
        setPayload(payload);
        setRequired(required);
        setAverage(average);
        setErrorMessage(errorMessage);
        setErrorCode(errorCode);
    }

    public final String getTimestamp() {
        return timestamp;
    }

    public final void setTimestamp(final String timestamp) {
        this.timestamp = timestamp;
    }

    public final String getDeviceType() {
        return deviceType;
    }

    public final void setDeviceType(final String deviceType) {
        this.deviceType = deviceType;
    }

    public final Integer getDeviceID() {
        return deviceID;
    }

    public final void setDeviceID(final Integer deviceID) {
        this.deviceID = deviceID;
    }

    public final Integer getPayload() {
        return payload;
    }

    public final void setPayload(final Integer payload) {
        this.payload = payload;
    }

    public final Integer getRequired() {
        return required;
    }

    public final void setRequired(final Integer required) {
        this.required = required;
    }

    public final Float getAverage() {
        return average;
    }

    public final void setAverage(final Float average) {
        this.average = average;
    }

    public final String getErrorMessage() {
        return errorMessage;
    }

    public final void setErrorMessage(final String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public final Integer getErrorCode() {
        return errorCode;
    }

    public final void setErrorCode(final Integer errorCode) {
        this.errorCode = errorCode;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((average == null) ? 0 : average.hashCode());
        result = prime * result + ((deviceID == null) ? 0 : deviceID.hashCode());
        result = prime * result + ((deviceType == null) ? 0 : deviceType.hashCode());
        result = prime * result + ((errorCode == null) ? 0 : errorCode.hashCode());
        result = prime * result + ((errorMessage == null) ? 0 : errorMessage.hashCode());
        result = prime * result + ((payload == null) ? 0 : payload.hashCode());
        result = prime * result + ((required == null) ? 0 : required.hashCode());
        result = prime * result + ((timestamp == null) ? 0 : timestamp.hashCode());
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof DataSet)) {
            return false;
        }
        DataSet other = (DataSet) obj;
        if (average == null) {
            if (other.average != null) {
            return false;
            }
        } else if (!average.equals(other.average)) {
            return false;
        }
        if (deviceID == null) {
            if (other.deviceID != null) {
            return false;
            }
        } else if (!deviceID.equals(other.deviceID)) {
            return false;
        }
        if (deviceType == null) {
            if (other.deviceType != null) {
            return false;
            }
        } else if (!deviceType.equals(other.deviceType)) {
            return false;
        }
        if (errorCode == null) {
            if (other.errorCode != null) {
            return false;
            }
        } else if (!errorCode.equals(other.errorCode)) {
            return false;
        }
        if (errorMessage == null) {
            if (other.errorMessage != null) {
            return false;
            }
        } else if (!errorMessage.equals(other.errorMessage)) {
            return false;
        }
        if (payload == null) {
            if (other.payload != null) {
            return false;
            }
        } else if (!payload.equals(other.payload)) {
            return false;
        }
        if (required == null) {
            if (other.required != null) {
            return false;
            }
        } else if (!required.equals(other.required)) {
            return false;
        }
        if (timestamp == null) {
            if (other.timestamp != null) {
            return false;
            }
        } else if (!timestamp.equals(other.timestamp)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DataSet.businessrules [timestamp=" + timestamp + ", deviceType=" + deviceType + ", deviceID=" + deviceID
                + ", payload=" + payload + ", required=" + required + ", average=" + average + ", errorMessage="
                + errorMessage + ", errorCode=" + errorCode + "]";
    }

}
