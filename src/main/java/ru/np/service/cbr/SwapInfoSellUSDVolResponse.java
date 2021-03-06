
package ru.np.service.cbr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SwapInfoSellUSDVolResult" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;any/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "swapInfoSellUSDVolResult"
})
@XmlRootElement(name = "SwapInfoSellUSDVolResponse", namespace = "http://web.cbr.ru/")
public class SwapInfoSellUSDVolResponse {

    @XmlElement(name = "SwapInfoSellUSDVolResult", namespace = "http://web.cbr.ru/")
    protected SwapInfoSellUSDVolResponse.SwapInfoSellUSDVolResult swapInfoSellUSDVolResult;

    /**
     * Gets the value of the swapInfoSellUSDVolResult property.
     * 
     * @return
     *     possible object is
     *     {@link SwapInfoSellUSDVolResponse.SwapInfoSellUSDVolResult }
     *     
     */
    public SwapInfoSellUSDVolResponse.SwapInfoSellUSDVolResult getSwapInfoSellUSDVolResult() {
        return swapInfoSellUSDVolResult;
    }

    /**
     * Sets the value of the swapInfoSellUSDVolResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwapInfoSellUSDVolResponse.SwapInfoSellUSDVolResult }
     *     
     */
    public void setSwapInfoSellUSDVolResult(SwapInfoSellUSDVolResponse.SwapInfoSellUSDVolResult value) {
        this.swapInfoSellUSDVolResult = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;any/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "any"
    })
    public static class SwapInfoSellUSDVolResult {

        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * Gets the value of the any property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getAny() {
            return any;
        }

        /**
         * Sets the value of the any property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setAny(Object value) {
            this.any = value;
        }

    }

}
